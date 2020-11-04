package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float temp = super.getValue();
        Temperature temps = new Celsius(temp);
        return temps;
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = (float) (super.getValue()*1.8+32);
        Temperature temps = new Celsius(temp);
        return temps;
    }

    public String toString()
    {
        String result = Float.toString(super.getValue())+" C";
        return result;
    }
}