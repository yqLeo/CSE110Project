package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float temp = (float) ((super.getValue()-32)/1.8);
        Temperature temps = new Fahrenheit(temp);
        return temps;
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = super.getValue();
        Temperature temps = new Fahrenheit(temp);
        return temps;
    }

    public String toString()
    {
        String result = Float.toString(super.getValue())+" F";
        return result;
    }
}