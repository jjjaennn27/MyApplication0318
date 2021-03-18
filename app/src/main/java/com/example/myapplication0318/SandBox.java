package com.example.myapplication0318;

import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.List;

public class SandBox extends RectShape { //camel-case
    private List<String> mGreetings = new ArrayList<>();

/*    //파라미터를 받는 것
    public SandBox(List<String> mGreetings) {
        this.mGreetings = mGreetings; //this 붙여야 함
    }*/

    public SandBox() {
    }

    //getter
    public List<String> get_mGreetings() { //snake-case
        return mGreetings; //값 반환
    }

    //setter
    public void set_mGreetings(List<String> mGreetings) { //void : 반환 값이 없다
        this.mGreetings = mGreetings; //값 설정 this 필요
    }

    @Override
    public String toString() { //문자열 추가
        return "SandBox{" +
                "mGreetings=" + mGreetings +
                '}';
    }
}
