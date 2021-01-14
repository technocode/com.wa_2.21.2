package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: X.3MM  reason: invalid class name */
public class AnonymousClass3MM {
    public static volatile AnonymousClass3MM A04;
    public final C002701k A00;
    public final AnonymousClass3MP A01;
    public volatile Boolean A02;
    public volatile ConcurrentHashMap A03;

    public AnonymousClass3MM(C002701k r1, AnonymousClass3MP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass3MM A00() {
        if (A04 == null) {
            synchronized (AnonymousClass3MM.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass3MM(C002701k.A00(), C64892yy.A00());
                }
            }
        }
        return A04;
    }

    public long A01(int i) {
        A02();
        Number number = (Number) this.A03.get(Integer.valueOf(i));
        if (number == null) {
            return 0;
        }
        long longValue = number.longValue();
        if (longValue > 0) {
            return longValue;
        }
        return longValue * -1;
    }

    public final void A02() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    try {
                        JSONArray jSONArray = this.A00.A08(226).getJSONArray("sampling");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                            int i2 = jSONArray2.getInt(0);
                            int i3 = jSONArray2.getInt(1);
                            long max = Math.max(jSONArray2.getLong(2), 0L);
                            if (3 == i3) {
                                concurrentHashMap.put(Integer.valueOf(i2), Long.valueOf(max * -1));
                            } else {
                                concurrentHashMap.put(Integer.valueOf(i2), Long.valueOf(max));
                            }
                        }
                    } catch (Exception e) {
                        this.A01.A00(15, "errorString:%s", e.getMessage());
                        concurrentHashMap.clear();
                    }
                    this.A03 = concurrentHashMap;
                }
            }
        }
    }

    public boolean A03() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(this.A00.A0E(212));
                }
            }
        }
        return this.A02.booleanValue();
    }
}
