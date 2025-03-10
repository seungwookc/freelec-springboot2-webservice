package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController // 컨트롤러의 JSON 반환 예전에는 @RespoonseBody로 메서드마 선언했으나 한번에 사용할 수 있게 바뀜
public class HelloController {

    @GetMapping("/hello") // http method인 get요청 받을 수 잇는 api 만들어줌
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public ResponseEntity<HelloResponseDto> helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        //return new ResponseEntity<>(new HelloResponseDto(name, amount), HttpStatus.OK);
        return ResponseEntity.ok(new HelloResponseDto(name, amount));  //위랑 같은 내용

    }
}
