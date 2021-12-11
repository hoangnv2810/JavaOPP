package ThongKeTuKhacNhauTrongFileVanBan;

public class Pair{
    private String key;
    private Integer value;

    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
