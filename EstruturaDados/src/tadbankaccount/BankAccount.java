package tadbankaccount;

import java.util.Scanner;

public class BankAccount implements BankAccountInterface {
	private Double saldo;

	public BankAccount() {
		super();
		this.saldo = 0.0;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public void atualizar() {
		System.out.println("Seu saldo é: " + saldo);
	}

	@Override
	public Double sacar(Double value) {
		if (value > saldo) {
			System.out.println("Impossivel realizar o saque verifique seu saldo");
		}else {
			saldo -= value;
		}
		return saldo;
	}

	@Override
	public Double depositar(Double value) {
		saldo += value;
		return saldo;
	}

}
