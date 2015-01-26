package practice;

interface OperationsInventaire
{
	void valid();
	void cumuls();
}

class InvSelector
{
	OperationsInventaire make(ListInv list)
	{
		if(list.getTypListInv() == TypListInv.PRODUIT)
		{
			return new InventaireProduit(list);
		}
		if(list.getInventaire().getFlagTournant() == Booleen.OUI)
		{
			return new InventaireTournantEmpla(list);
		}
		return new InventaireAdminEmpla(list);
	}
}

class InventaireProduit implements OperationsInventaire
{
	public InventaireProduit(ListInv list) 
	{// TODO Auto-generated constructor stub
	}
	public void valid() { /*...*/ }
	public void cumuls() { /*...*/ }
}

class InventaireTournantEmpla implements OperationsInventaire
{
	public InventaireTournantEmpla(ListInv list) 
	{// TODO Auto-generated constructor stub
	}
	public void valid() { /*...*/ }
	public void cumuls() { /*do nothing*/ }
}

class InventaireAdminEmpla implements OperationsInventaire
{
	public InventaireAdminEmpla(ListInv list) 
	{// TODO Auto-generated constructor stub
	}
	public void valid() { /*...*/ }
	public void cumuls() { /*...*/ }
}

class ListInv
{
	public int getTypListInv() 
	{// TODO Auto-generated method stub
		return 0;
	}

	public Inventaire getInventaire() 
	{// TODO Auto-generated method stub
		return null;
	}
}
class Inventaire
{
	public int getFlagTournant()
	{// TODO Auto-generated method stub
		return 0;
	}
}
class TypListInv
{
	public static final int PRODUIT = 0;
}
class Booleen
{
	public static final int OUI = 1;
}


