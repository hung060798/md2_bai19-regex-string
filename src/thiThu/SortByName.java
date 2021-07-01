package thiThu;

import java.util.Comparator;

public class SortByName implements Comparator <SinhVien>{
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
