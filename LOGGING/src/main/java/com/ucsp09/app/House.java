package com.ucsp09.app;

class InvalidMaterialStandardException extends Exception{
    public InvalidMaterialStandardException(String s)
    {
        super(s);
    }
}
public class House {
    public double estimateConstructionCost(String materialStandard,double houseArea, boolean automatedHome) throws Exception
    {
        if(materialStandard=="standard")
        {
            if(automatedHome)
                return (1200.0+700.0)*houseArea;
            return 1200.0*houseArea;    
        }
        else if(materialStandard=="above standard")
        {
            if(automatedHome)
                return (1500.0+700.0)*houseArea;
            return 1500.0*houseArea;
        }
        else if(materialStandard=="high standard")
        {
            if(automatedHome)
                return (1800.0+700.0)*houseArea;
            return 1800.0*houseArea;
        }
        else
        {
            throw new InvalidMaterialStandardException("Material Standard should be either standard,above standard or high standard");
        }
    }
}