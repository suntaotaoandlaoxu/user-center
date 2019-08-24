package com.suntt.usercenter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by IntelliJ IDEA.
 * Author: suntaotao
 * Date: 2019/8/24
 * Time: 16:04
 * Describe: lombok测试
 * To change this template use File | Settings | File Templates.
 */

@Slf4j
public class LombokTest {
    public static void main(String[] args) {
        UserRegisterDto userRegisterDto = new UserRegisterDto();


        UserRegisterDto.builder()
                .email("")
                .password("")
                .build();

        log.info("你好啊");
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class UserRegisterDto{
    private String userName;
    private String password;
    private String email;
}
