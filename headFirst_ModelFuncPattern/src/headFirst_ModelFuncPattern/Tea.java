package headFirst_ModelFuncPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Tea extends Drink {

	@Override
	protected void add() {
		// TODO 自动生成的方法存根
		System.out.println("Steeping the tea.");
	}

	@Override
	protected void brew() {
		// TODO 自动生成的方法存根
		System.out.println("Adding lemon.");
	}

	
	@Override
	protected boolean customWantAdd() {
		// TODO 自动生成的方法存根
		String answer = getUserInput();
		answer = answer.toLowerCase();
		if (answer.startsWith("y")) {
			return true;
		} 
		return false;
	}

	private String getUserInput() {
		// TODO 自动生成的方法存根
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		try {
			answer = in.readLine();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		if (answer == null) {
			return "no";
		}
		
		return answer;
	}
}
