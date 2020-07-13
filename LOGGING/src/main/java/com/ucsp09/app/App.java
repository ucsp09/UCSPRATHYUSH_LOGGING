package com.ucsp09.app;


import org.apache.logging.log4j.*;

public class App{
    private static final Logger logger=LogManager.getLogger(App.class);
    public static void main(String[] args){
        try{
            Interest obj1=new Interest();
            logger.info(obj1.calculateSimpleInterest(200,2,4));
            logger.info(obj1.calculateCompoundInterest(200,2,4));
            House obj2=new House();
            logger.info(obj2.estimateConstructionCost("standard",200,true));
            logger.info(obj2.estimateConstructionCost("standard",200,false));
            logger.info(obj2.estimateConstructionCost("above standard",200,true));
            logger.info(obj2.estimateConstructionCost("above standard",200,false));
            logger.info(obj2.estimateConstructionCost("high standard",200,true));
            logger.info(obj2.estimateConstructionCost("high standard",200,false));
            logger.info(obj2.estimateConstructionCost("below standard",200,true));
        }
        catch(Exception E){
            logger.error(E.getMessage());
        }
    }
}