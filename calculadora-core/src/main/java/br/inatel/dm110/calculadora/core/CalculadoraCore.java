package br.inatel.dm110.calculadora.core;

import br.inatel.dm110.calculadora.api.Calculadora;
import br.inatel.dm110.calculadora.api.Result;

public class CalculadoraCore implements Calculadora {

	@Override
	public Result sum(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first+second);
		return result;
	}

	@Override
	public Result subtract(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first-second);
		return result;
	}

}
