package baseball;


import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {

    public static void main(String[] args) throws IllegalArgumentException{
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        Computer computer = new Computer();
        Game game = new Game();
        boolean reStart = game.playGame(computer.ComputerNumber());
        if(reStart) {
            game.playGame(computer.ComputerNumber());
        }
        Console.close();
    }
}