package com.dkd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DkdApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DkdApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  帝可得启动成功   ლ(´ڡ`ლ)ﾞ");
    }
    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] flag = new boolean[n];
        dfs(0, n, flag, new ArrayList<>());
    }
    public static void dfs(int index, int n, boolean[] flag, List<Integer> current) {
        if(index == 2) {

        }
    }
}
