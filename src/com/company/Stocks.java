package com.company;

/**
 * class stocks with parameters

 */
public class Stocks {

    private String stocks;
    private int montantOuverture;
    private int montantFermeture;
    private String reference;


    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public int getMontantOuverture() {
        return montantOuverture;
    }

    public void setMontantOuverture(int montantOuverture) {
        this.montantOuverture = montantOuverture;
    }

    public int getMontantFermeture() {
        return montantFermeture;
    }

    public void setMontantFermeture(int montantFermeture) {
        this.montantFermeture = montantFermeture;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Stocks (String stocks, int montantOuverture, int montantFermeture, String reference){
        this.montantFermeture = montantFermeture;
        this.stocks = stocks;
        this.montantOuverture = montantOuverture;
        this.reference = reference;

    }
}
