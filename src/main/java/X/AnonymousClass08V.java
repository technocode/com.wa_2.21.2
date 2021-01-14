package X;

import android.graphics.Bitmap;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.08V  reason: invalid class name */
public class AnonymousClass08V {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final LinkedHashMap A06;

    public AnonymousClass08V(int i) {
        if (i > 0) {
            this.A02 = i;
            this.A06 = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized int A00() {
        return this.A02;
    }

    public final synchronized int A01() {
        return this.A05;
    }

    public final int A02(Object obj, Object obj2) {
        int byteCount;
        if (this instanceof AnonymousClass08W) {
            byteCount = ((Bitmap) obj2).getByteCount() >> 10;
        } else if (this instanceof AnonymousClass08X) {
            byteCount = ((AnonymousClass08X) this).A00.A00(obj, ((C12430i5) obj2).A01);
        } else if (!(this instanceof AnonymousClass08Y)) {
            byteCount = 1;
        } else {
            byteCount = ((Bitmap) obj2).getByteCount() >> 10;
        }
        if (byteCount >= 0) {
            return byteCount;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(obj);
        sb.append("=");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public final Object A03(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.A06.get(obj);
                if (obj2 != null) {
                    this.A01++;
                    return obj2;
                }
                this.A03++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final Object A04(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.A06.remove(obj);
                if (remove != null) {
                    this.A05 -= A02(obj, remove);
                }
            }
            if (remove != null) {
                A08(false, obj, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized Map A05() {
        return new LinkedHashMap(this.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(getClass().getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(int r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08V.A06(int):void");
    }

    public final void A07(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.A04++;
            this.A05 += A02(obj, obj2);
            put = this.A06.put(obj, obj2);
            if (put != null) {
                this.A05 -= A02(obj, put);
            }
        }
        if (put != null) {
            A08(false, obj, put, obj2);
        }
        A06(this.A02);
    }

    public void A08(boolean z, Object obj, Object obj2, Object obj3) {
        int i;
        C54292eg r0;
        AnonymousClass1TZ r02;
        if (this instanceof C71543Pj) {
            AbstractC659532f r8 = (AbstractC659532f) obj2;
            StatusPlaybackContactFragment statusPlaybackContactFragment = ((C71543Pj) this).A00;
            AnonymousClass32Z r03 = (AnonymousClass32Z) statusPlaybackContactFragment.A0A();
            if (r03 != null) {
                i = r03.A72();
            } else {
                i = 0;
            }
            C659832i.A00(r8, i);
            if (r8 != null && r8.A04) {
                r8.A06();
            }
            if (statusPlaybackContactFragment.A0T == null) {
                throw null;
            } else if (r8 != null && r8.A01) {
                if (r8.A03) {
                    r8.A03();
                }
                r8.A02();
            }
        } else if (this instanceof AnonymousClass0Cj) {
            AnonymousClass0Cj r04 = (AnonymousClass0Cj) this;
            AnonymousClass1W6 r82 = (AnonymousClass1W6) obj2;
            if (z) {
                r04.A00.A06(r82);
            }
        } else if (this instanceof C54552f6) {
            C54552f6 r1 = (C54552f6) this;
            synchronized (r1) {
                r0 = r1.A00;
            }
            if (r0 != null) {
                r0.A00.A02().execute(new RunnableEBaseShape9S0100000_I1_4(obj2, 48));
            }
        } else if (this instanceof C018009m) {
            C018009m r05 = (C018009m) this;
            if (z) {
                C017909l r12 = r05.A00;
                Map map = r12.A02;
                map.put(obj, new WeakReference(obj2));
                int i2 = r12.A00 + 1;
                r12.A00 = i2;
                if (i2 % 200 == 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((Reference) entry.getValue()).get() == null) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        map.remove(it.next());
                    }
                }
            }
        } else if (this instanceof AnonymousClass08X) {
            AnonymousClass0DD r13 = ((AnonymousClass08X) this).A00;
            Object obj4 = ((C12430i5) obj2).A01;
            if (r13 instanceof C12280hq) {
                C12280hq r14 = (C12280hq) r13;
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj4;
                if (z) {
                    for (AnonymousClass0DE r06 : r14.A00.A0G) {
                        r06.AJH(str, bitmap);
                    }
                }
            }
        } else if ((this instanceof C43371yG) && (r02 = ((C43371yG) this).A00) != null) {
            r02.AFW(z, obj, obj2, obj3);
        }
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        i = this.A01;
        i2 = this.A03;
        int i4 = i + i2;
        i3 = 0;
        if (i4 != 0) {
            i3 = (i * 100) / i4;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.A02), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
