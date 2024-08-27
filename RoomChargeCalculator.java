public class RoomChargeCalculator

{
    private double fixedFee;
	private double total;

    public double getFixedFee()
    {
        return fixedFee;
    }

    public void setFixedFee(double fixedFee)
    {
        this.fixedFee = fixedFee;
    }

    public double getTotal()
    {
        return total;
    }

    public void setTotal(double total)
    {
        this.total = total;
    }

    public double getChargeDeluxDouble(boolean balcony , boolean parking , boolean tv , boolean kitchen , boolean wifi)
    {
        this.setFixedFee(5000);
		this.setTotal(this.getFixedFee());

        if(balcony)
        {
            this.setTotal(this.getTotal() + 500);
        }

        if(parking)
        {
            this.setTotal(this.getTotal() + 200);
        }

        if(tv) 
        {
            this.setTotal(this.getTotal() + 200);
		}

        if(kitchen)
        {
            this.setTotal(this.getTotal() + 1000);
        }

        if(wifi)
        {
            this.setTotal(this.getTotal() + 100);
        }

        return this.getTotal();
        
    }

    public double getChargeStandardFamily(boolean parking , boolean kitchen , boolean garden)
    {
        this.setFixedFee(3000);
		this.setTotal(this.getFixedFee());

        if(parking)
        {
            this.setTotal(this.getTotal() + 200);
        }

        if(kitchen)
        {
            this.setTotal(this.getTotal() + 500);
        }

        if(garden)
        {
            this.setTotal(this.getTotal() + 200);
        }

		return this.getTotal();

    }

    public double getChargeStandardSingle(boolean parking , boolean ac , boolean wifi)
    {
        this.setFixedFee(2000);
		this.setTotal(this.getFixedFee());

        if(parking)
        {
            this.setTotal(this.getTotal() + 200);
        }

        if(ac)
        {
            this.setTotal(this.getTotal() + 500);
        }

        if(wifi)
        {
            this.setTotal(this.getTotal() + 100);
        }

        return this.getTotal();
        
    }



}