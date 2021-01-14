package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3ZE  reason: invalid class name */
public class AnonymousClass3ZE extends AnonymousClass3MQ implements AbstractC64972z6 {
    public static volatile AbstractC64972z6 A03;
    public final C64902yz A00;
    public final AnonymousClass00T A01;
    public final AbstractC02190Az A02;

    public AnonymousClass3ZE(AnonymousClass00S r1, AnonymousClass00T r2, C64902yz r3, AnonymousClass3MP r4, AbstractC02190Az r5, AnonymousClass3MM r6, AbstractC64942z3 r7) {
        super(r1, r4, r6, r7);
        this.A01 = r2;
        this.A02 = r5;
        this.A00 = r3;
    }

    public static AbstractC64972z6 A00() {
        if (A03 == null) {
            synchronized (AbstractC64972z6.class) {
                if (A03 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass00T A003 = C002101e.A00();
                    C64902yz r8 = new C64902yz(C64892yy.A00());
                    AnonymousClass3MP A004 = C64892yy.A00();
                    C02180Ay r10 = new C02180Ay(AnonymousClass3MK.A00, null);
                    AnonymousClass3MM A005 = AnonymousClass3MM.A00();
                    if (AnonymousClass3MR.A05 == null) {
                        synchronized (AnonymousClass3MR.class) {
                            if (AnonymousClass3MR.A05 == null) {
                                AnonymousClass3MR.A05 = new AnonymousClass3MR(C64932z2.A00(), AnonymousClass3MM.A00());
                            }
                        }
                    }
                    A03 = new AnonymousClass3ZE(A002, A003, r8, A004, r10, A005, AnonymousClass3MR.A05);
                }
            }
        }
        return A03;
    }

    @Override // X.AbstractC64972z6
    public void A45(short s, int i) {
        if (super.A01.A03()) {
            long A002 = A00();
            A02(this.A04, s, i, A002);
            A02(this.A06, s, i, A002);
        }
    }

    @Override // X.AbstractC64972z6
    public void A46(short s, boolean z) {
        if (super.A01.A03()) {
            long A002 = A00();
            A03(this.A06, s, z, A002);
            A03(this.A04, s, z, A002);
        }
    }

    @Override // X.AbstractC64972z6
    public Collection A4j() {
        HashSet hashSet = new HashSet(this.A04.keySet());
        for (Number number : this.A06.keySet()) {
            hashSet.add(Integer.valueOf((int) (number.longValue() >> 32)));
        }
        return hashSet;
    }

    @Override // X.AbstractC64972z6
    public void ABu(int i, String str, boolean z) {
        C64912z0 r5 = (C64912z0) this.A04.get(Integer.valueOf(i));
        if (r5 != null) {
            Boolean valueOf = Boolean.valueOf(z);
            if (str.length() > 50) {
                r5.A03.A00(13, "markerId:%d, annotationKey:%s", Integer.valueOf(r5.A00), str);
                return;
            }
            AtomicInteger atomicInteger = r5.A06;
            if (atomicInteger.get() + 1 >= 1000) {
                r5.A03.A00(1, "markerId:%d, annotationKey:%s", Integer.valueOf(r5.A00), str);
                return;
            }
            atomicInteger.addAndGet(1);
            if (r5.A04.putIfAbsent(str, valueOf) != null) {
                atomicInteger.addAndGet(-1);
            }
        }
    }

    @Override // X.AbstractC64972z6
    public void ABv(int i, short s) {
        long A002 = super.A00();
        C64912z0 r1 = (C64912z0) this.A04.remove(Integer.valueOf(i));
        if (r1 != null) {
            r1.A00(s, A002);
            this.A07.decrementAndGet();
            this.A05.add(r1);
            A01();
        }
    }

    @Override // X.AbstractC64972z6
    public void ABw(int i, String str) {
        C64912z0 r5 = (C64912z0) this.A04.get(Integer.valueOf(i));
        if (r5 != null) {
            long A002 = super.A00();
            AtomicInteger atomicInteger = r5.A08;
            if (atomicInteger.get() >= 1000) {
                r5.A03.A00(2, "markerId:%d", Integer.valueOf(r5.A00));
            } else if (str.length() > 50) {
                r5.A03.A00(12, "markerId:%d, pointName:%s", Integer.valueOf(r5.A00), str);
            } else {
                r5.A05.put(Integer.valueOf(atomicInteger.getAndIncrement()), new C64922z1(str, A002));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        if (r0.longValue() >= 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r0.longValue() >= 0) goto L_0x0030;
     */
    @Override // X.AbstractC64972z6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ABx(int r16) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZE.ABx(int):void");
    }

    @Override // X.AbstractC64972z6
    public String AM4() {
        Object obj;
        String str;
        C64902yz r3 = this.A00;
        C64912z0 r2 = (C64912z0) this.A05.poll();
        if (r3 != null) {
            if (r2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("marker_id", r2.A00);
                    jSONObject.put("action_id", (short) r2.A07.get());
                    if (r2.A0B) {
                        obj = "per_user";
                    } else {
                        obj = "random_sampling";
                    }
                    jSONObject.put("method", obj);
                    jSONObject.put("sample_rate", r2.A01);
                    long j = r2.A09.get();
                    long j2 = r2.A02;
                    jSONObject.put("duration_ns", j - j2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : r2.A05.values()) {
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                    Collections.sort(arrayList);
                    if (!arrayList.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C64922z1 r6 = (C64922z1) it.next();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", r6.A01);
                            jSONObject2.put("time_since_start_ns", r6.A00 - j2);
                            jSONArray.put(jSONObject2);
                        }
                        jSONObject.put("points", jSONArray);
                    }
                    HashMap hashMap = new HashMap();
                    ConcurrentHashMap concurrentHashMap = r2.A04;
                    for (Object obj3 : concurrentHashMap.keySet()) {
                        Object obj4 = concurrentHashMap.get(obj3);
                        if (obj4 != null) {
                            hashMap.put(obj3, obj4);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        HashMap hashMap2 = new HashMap();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            Class<?> cls = entry.getValue().getClass();
                            List list = (List) hashMap2.get(cls);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap2.put(cls, list);
                            }
                            list.add(entry);
                        }
                        for (Map.Entry entry2 : hashMap2.entrySet()) {
                            Object key = entry2.getKey();
                            if (key == String.class) {
                                str = "annotations";
                            } else if (key == Double.class) {
                                str = "annotations_double";
                            } else if (key == Boolean.class) {
                                str = "annotations_bool";
                            } else if (key == Long.class) {
                                str = "annotations_int";
                            } else if (key == String[].class) {
                                str = "annotations_string_array";
                            } else if (key == double[].class) {
                                str = "annotations_double_array";
                            } else if (key == boolean[].class) {
                                str = "annotations_bool_array";
                            } else if (key == long[].class) {
                                str = "annotations_int_array";
                            } else {
                                StringBuilder sb = new StringBuilder("Unknown class: ");
                                sb.append(key);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            if (((Class) entry2.getKey()).isArray()) {
                                for (Map.Entry entry3 : (List) entry2.getValue()) {
                                    JSONArray jSONArray2 = new JSONArray();
                                    int length = Array.getLength(entry3.getValue());
                                    for (int i = 0; i < length; i++) {
                                        Object obj5 = Array.get(entry3.getValue(), i);
                                        Object key2 = entry2.getKey();
                                        if (obj5 == null || !(key2 == double[].class || key2 == Double.class)) {
                                            jSONArray2.put(obj5);
                                        } else {
                                            jSONArray2.put(new BigDecimal(((Number) obj5).doubleValue(), MathContext.DECIMAL32).doubleValue());
                                        }
                                    }
                                    jSONObject3.put((String) entry3.getKey(), jSONArray2);
                                }
                            } else {
                                for (Map.Entry entry4 : (List) entry2.getValue()) {
                                    String str2 = (String) entry4.getKey();
                                    Object value = entry4.getValue();
                                    Object key3 = entry2.getKey();
                                    if (value == null || !(key3 == double[].class || key3 == Double.class)) {
                                        jSONObject3.put(str2, value);
                                    } else {
                                        jSONObject3.put(str2, new BigDecimal(((Number) value).doubleValue(), MathContext.DECIMAL32).doubleValue());
                                    }
                                }
                            }
                            jSONObject.put(str, jSONObject3);
                        }
                    }
                    return jSONObject.toString();
                } catch (JSONException e) {
                    AnonymousClass3MP r4 = r3.A00;
                    int i2 = r2.A00;
                    r4.A00(6, "markerId:%d, errorString:%s", Integer.valueOf(i2), e.getMessage());
                }
            }
            return null;
        }
        throw null;
    }
}
