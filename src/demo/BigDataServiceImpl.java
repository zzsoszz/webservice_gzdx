package demo;

public class BigDataServiceImpl implements BigDataService {
    public BigData getBigData(String name, int size) {
        BigData bigData = new BigData(name, size);
        return bigData;
    }
}
