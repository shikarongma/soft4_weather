package example;


import com.WeatherWebServiceLocator;
import com.WeatherWebServiceSoap_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class HelloWorldClient {
    public static void main(String[] argv) throws ServiceException, RemoteException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的城市：");
        String city = scanner.next();
        String[] result = QueryWeatherForecastInfo(city);
        for (String r : result) {
            System.out.println(r);
        }

    }

    public static String[] QueryWeatherForecastInfo(String cityName) throws RemoteException, ServiceException, ServiceException {
        WeatherWebServiceLocator locator = new WeatherWebServiceLocator();
        WeatherWebServiceSoap_PortType weatherWebServiceSoap = locator.getWeatherWebServiceSoap();
        String[] weather = weatherWebServiceSoap.getWeatherbyCityName(cityName);
        return weather;
    }
}
