package tadbankaccount;

public interface BankAccountInterface {
	void atualizar();
	Double sacar(Double value);
	Double depositar(Double value);
}
