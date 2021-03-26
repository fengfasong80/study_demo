package com.stydy.leetcode.nhh;

import java.util.ArrayList;
import java.util.List;

/**
 * n皇后问题
 * @author fengfasong
 * @date 2020/9/1
 */
public class MySolution {
    /**
     *记录列
     */
    int rows[];
    /**
     * 次对角线记录（左上到右下）
     */
    int hills[];
    /**
     * 主对角线记录（有上到左下）
     */
    int dales[];
    /**
     * n皇后
     */
    int n;
    /**
     * 皇后位置
     */
    int queens[];
    /**
     * 输出，以List存储皇后位置
     */
    List<List<String>> output = new ArrayList();

    /**
     * 判断该位置是否可以放置皇后
     * @param row
     * @param col
     * @return
     */
    public boolean isNotUnderAttack(int row, int col){
        int res = rows[col] + hills[row - col + n*2] + dales[row + col];
        return (res == 0) ? true:false;
    }

    /**
     * 放置皇后
     * @param row
     * @param col
     */
    public void placeQueen(int row, int col){
        queens[row] = col;
        rows[col] = 1;
        hills[row - col + 2 * n] = 1;
        dales[row + col] = 1;
    }

    /**
     * 移除皇后，回溯点进行移除
     * @param row
     * @param col
     */
    public void removeQueen(int row, int col){
        queens[row] = 0;
        rows[col] = 0;
        hills[row - col + 2 * n] = 0;
        dales[row + col] = 0;
    }

    /**
     * 将皇后位置存入List，皇后位置用Q表示，.表示该位置不能放置皇后
     */
    public void addSolution(){
        List<String> solution = new ArrayList<String>();
        for(int i = 0;i < n;++i){
            int col = queens[i];
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j < col;++j){
                sb.append(".");
            }
            sb.append("Q");
            for(int j = 0;j < n - col - 1;++j){
                sb.append(".");
            }
            solution.add(sb.toString());
        }
        output.add(solution);
    }

    /**
     * 回溯
     * @param row
     */
    public void backtrack(int row){
        for(int col = 0;col<n;col++){
            if(isNotUnderAttack(row,col)){
                placeQueen(row,col);
                if(row + 1 == n){
                    addSolution();
                }
                else {
                    /**
                     * 回溯点
                     */
                    backtrack(row + 1);
                }
                removeQueen(row,col);
            }
        }
    }

    /**
     * 初始化定义
     * @param n
     * @return
     */
    public List<List<String>> solveNQueens(int n){
        this.n = n;
        rows = new int[n];
        hills = new int[4 * n - 1];
        dales = new int[2 * n - 1];
        queens = new int[n];
        backtrack(0);

        return output;
    }

    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        List<List<String>> lists = mySolution.solveNQueens(4);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}
