package diagram;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface GUIInterface extends ExternalClass{
	public void CheckPin();
	public String getValue();
	public String getServices();
	public void printInquery(String S);
	public void Withdrawal();
	public void mobile();
	public void mobileamount();
	public void setValueNull();

}
