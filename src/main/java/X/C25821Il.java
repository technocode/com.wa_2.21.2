package X;

import com.whatsapp.PlaceInfo;
import java.util.Comparator;

/* renamed from: X.1Il  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25821Il implements Comparator {
    public static final /* synthetic */ C25821Il A00 = new C25821Il();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Double.compare(((PlaceInfo) obj).dist, ((PlaceInfo) obj2).dist);
    }
}
