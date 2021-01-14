package X;

import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.StickyHeadersRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0pa  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16300pa {
    public boolean A00 = false;
    public final C16310pb A01 = new C16310pb();

    public abstract int A05();

    public abstract AbstractC11910hD A06(ViewGroup viewGroup, int i);

    public abstract void A07(AbstractC11910hD v, int i);

    public int A00(int i) {
        int i2;
        boolean z;
        int size;
        if (this instanceof AnonymousClass3UT) {
            Object obj = ((AnonymousClass3UT) this).A02.get(i);
            if (obj != null) {
                return ((C676139i) obj).A00;
            }
            throw null;
        } else if (this instanceof C72593Tm) {
            C72593Tm r2 = (C72593Tm) this;
            if (i < r2.A00) {
                return 0;
            }
            return (r2.A02.A04.A06(AbstractC000400g.A3J) >= 2 || i != (i2 = r2.A00) || i2 <= 0) ? 1 : 2;
        } else if (this instanceof AnonymousClass3TS) {
            Object obj2 = ((AnonymousClass3TS) this).A00.get(i);
            if (obj2 != null) {
                return ((C674138m) obj2).A00;
            }
            throw null;
        } else if (this instanceof AnonymousClass3RT) {
            AnonymousClass3RT r3 = (AnonymousClass3RT) this;
            int i3 = 0;
            for (Map.Entry entry : r3.A0H.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    if (i3 == i) {
                        return ((Number) entry.getKey()).intValue();
                    }
                    i3++;
                }
            }
            boolean z2 = r3.A07;
            if (!z2 || (z = r3.A08) || !z2 || z || ((r3.A05.size() != 0 && r3.A0A() <= 0) || i != r3.A05() - 1)) {
                return (!r3.A08 || r3.A09() != 0) ? 5 : 7;
            }
            return 6;
        } else if (this instanceof AnonymousClass3R7) {
            return ((AnonymousClass3R7) this).A00.get(i) instanceof AnonymousClass3R2 ? 1 : 0;
        } else {
            if (this instanceof C74143aE) {
                return A05() - 1 != i ? 0 : 1;
            }
            if (this instanceof C74133aD) {
                return A05() - 1 != i ? 0 : 1;
            }
            if (this instanceof C71353Oo) {
                return ((AbstractC658031p) ((C71353Oo) this).A04.get(i)).A00;
            }
            if (this instanceof AnonymousClass3OY) {
                return ((Number) ((AnonymousClass3OY) this).A0E.get(i)).intValue();
            }
            if (this instanceof AnonymousClass3HJ) {
                AnonymousClass0MH r22 = (AnonymousClass0MH) ((AnonymousClass3HJ) this).A00.get(i);
                if (r22.A02 != 1000 || !r22.A0L) {
                    return SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                }
                return 2000;
            } else if (this instanceof AnonymousClass3H6) {
                return ((AbstractC63232w5) ((AnonymousClass3H6) this).A00.get(i)).A00;
            } else {
                if (this instanceof C56092i3) {
                    C56092i3 r1 = (C56092i3) this;
                    int i4 = i;
                    if (r1.A01) {
                        return 2;
                    }
                    AbstractView$OnCreateContextMenuListenerC56112i5 r32 = r1.A02;
                    if (r32.A0n == null && r32.A0m == null) {
                        i4 = i - 1;
                        if (i == 0) {
                            return 3;
                        }
                    }
                    List list = r1.A00;
                    if (list.get(i4) == r32.A0m) {
                        return 4;
                    }
                    return list.get(i4) == r32.A0n ? 0 : 1;
                } else if (this instanceof C55442gY) {
                    C55442gY r23 = (C55442gY) this;
                    List list2 = r23.A01;
                    if (list2 == null) {
                        size = r23.A00;
                    } else {
                        size = r23.A00 - list2.size();
                    }
                    return (size <= 0 || i != r23.A01.size()) ? 0 : 1;
                } else if (this instanceof AnonymousClass3ZP) {
                    return ((AnonymousClass3ZP) this).A0c.A00(i);
                } else {
                    if (this instanceof C59912oU) {
                        return ((C59912oU) this).A02.get(i) instanceof C54602fC ? 1 : 0;
                    }
                    if (this instanceof AnonymousClass2cQ) {
                        return ((AnonymousClass2cQ) this).A08(i).A02;
                    }
                    if (this instanceof C52062aW) {
                        return (!TextUtils.isEmpty(((AnonymousClass2JF) ((C52062aW) this).A02.get(i)).A01) ? 1 : 0) ^ 1;
                    }
                    if (this instanceof C51022Xa) {
                        return ((AnonymousClass2FC) ((C51022Xa) this).A02.get(i)).A00;
                    }
                    if (this instanceof AbstractC42511wp) {
                        AbstractC42511wp r33 = (AbstractC42511wp) this;
                        int size2 = r33.A09.size();
                        if (i < r33.A08()) {
                            return 1;
                        }
                        if ((i - r33.A08()) - 0 >= size2) {
                            return (i - r33.A08()) - 0 < 0 ? 3 : 2;
                        }
                        return 0;
                    } else if (this instanceof C40941uA) {
                        Object obj3 = ((C40941uA) this).A00.get(i);
                        if (obj3 instanceof AnonymousClass1OR) {
                            return 0;
                        }
                        if (obj3 instanceof AnonymousClass1OP) {
                            return 1;
                        }
                        if (obj3 instanceof AnonymousClass1OQ) {
                            return 2;
                        }
                        return obj3 instanceof AnonymousClass1OT ? 3 : -1;
                    } else if (!(this instanceof C40891u0)) {
                        return 0;
                    } else {
                        C40891u0 r12 = (C40891u0) this;
                        long A08 = r12.A08(i);
                        if (StickyHeadersRecyclerView.A09(A08)) {
                            return -1000;
                        }
                        return r12.A00.A00((int) (A08 & 4294967295L));
                    }
                }
            }
        }
    }

    public long A01(int i) {
        List list;
        Number number;
        AbstractC48882Od r1;
        AbstractC48882Od A08;
        Cursor cursor;
        if (this instanceof AnonymousClass3UT) {
            return (long) ((AnonymousClass3UT) this).A02.get(i).hashCode();
        }
        if (this instanceof AnonymousClass3R7) {
            AnonymousClass3R7 r12 = (AnonymousClass3R7) this;
            if (!((AbstractC16300pa) r12).A00) {
                return -1;
            }
            String str = ((C662433l) r12.A00.get(i)).A01;
            AnonymousClass3R8 r5 = r12.A02;
            HashMap hashMap = r5.A0C;
            Number number2 = (Number) hashMap.get(str);
            if (number2 == null) {
                long j = r5.A03;
                r5.A03 = 1 + j;
                number2 = Long.valueOf(j);
                hashMap.put(str, number2);
            }
            return number2.longValue();
        } else if (this instanceof AnonymousClass3QG) {
            AnonymousClass3QG r13 = (AnonymousClass3QG) this;
            if (!((AbstractC16300pa) r13).A00 || (list = r13.A03) == null || (number = (Number) r13.A0A.get(((C29241Xq) list.get(i)).A0A)) == null) {
                return -1;
            }
            return number.longValue();
        } else if (this instanceof C54462ex) {
            return (long) i;
        } else {
            if (this instanceof C54202eW) {
                ArrayList arrayList = ((C54202eW) this).A04.A0T;
                if (arrayList == null) {
                    return 0;
                }
                return (long) arrayList.get(i).hashCode();
            } else if (this instanceof C53982eA) {
                return (long) i;
            } else {
                if (this instanceof C53812ds) {
                    C53812ds r6 = (C53812ds) this;
                    AbstractC48892Oe r0 = r6.A04.A08;
                    if (r0 != null) {
                        r1 = r0.A7I(i);
                    } else {
                        r1 = null;
                    }
                    if (!((AbstractC16300pa) r6).A00 || r1 == null) {
                        return 0;
                    }
                    Uri A4W = r1.A4W();
                    Map map = r6.A03;
                    Number number3 = (Number) map.get(A4W);
                    if (number3 == null) {
                        long j2 = r6.A01;
                        r6.A01 = 1 + j2;
                        number3 = Long.valueOf(j2);
                        map.put(A4W, number3);
                    }
                    return number3.longValue();
                } else if (this instanceof C53322ct) {
                    C53322ct r14 = (C53322ct) this;
                    if (!((AbstractC16300pa) r14).A00) {
                        return -1;
                    }
                    AnonymousClass2ND r62 = r14.A02;
                    if (!(r62 instanceof C53342cv)) {
                        throw new UnsupportedOperationException("You must override getStableId");
                    }
                    C53342cv r63 = (C53342cv) r62;
                    boolean z = r63.A01;
                    if (z && i == 0) {
                        return -1;
                    }
                    List list2 = r63.A03;
                    if (z) {
                        i--;
                    }
                    String str2 = ((AnonymousClass33N) list2.get(i)).A0D;
                    Map map2 = r63.A04;
                    Number number4 = (Number) map2.get(str2);
                    if (number4 == null) {
                        long j3 = r63.A00;
                        r63.A00 = 1 + j3;
                        number4 = Long.valueOf(j3);
                        map2.put(str2, number4);
                    }
                    return number4.longValue();
                } else if (this instanceof C50822We) {
                    C50822We r3 = (C50822We) this;
                    if (r3.A00 == null || (A08 = r3.A08(i)) == null) {
                        return 0;
                    }
                    return (long) C28051Sr.A0q(A08.A4W()).hashCode();
                } else if (this instanceof AbstractC42511wp) {
                    AbstractC42511wp r64 = (AbstractC42511wp) this;
                    int A002 = r64.A00(i);
                    if (A002 == 1) {
                        return -1;
                    }
                    if (A002 == 2) {
                        return -2;
                    }
                    if (A002 == 3) {
                        return -4 - ((long) i);
                    }
                    if (A002 == 4) {
                        return -3;
                    }
                    if (A002 == 5) {
                        return -5;
                    }
                    int A082 = i - r64.A08();
                    Map map3 = r64.A0A;
                    String str3 = ((C48052Ks) r64.A09.get(A082)).A06;
                    if (!map3.containsKey(str3)) {
                        long j4 = r64.A01;
                        r64.A01 = 1 + j4;
                        map3.put(str3, Long.valueOf(j4));
                    }
                    return ((Number) map3.get(str3)).longValue();
                } else if (this instanceof C40891u0) {
                    C40891u0 r15 = (C40891u0) this;
                    long A083 = r15.A08(i);
                    if (StickyHeadersRecyclerView.A09(A083)) {
                        return ((AnonymousClass1O2) r15.A00).A6e((int) (A083 >> 32));
                    }
                    return r15.A00.A01((int) (A083 & 4294967295L));
                } else if (this instanceof AbstractC39901sI) {
                    AbstractC39901sI r2 = (AbstractC39901sI) this;
                    if (!r2.A03 || (cursor = r2.A01) == null || !cursor.moveToPosition(i)) {
                        return 0;
                    }
                    return r2.A01.getLong(r2.A00);
                } else if (!(this instanceof AnonymousClass276)) {
                    return -1;
                } else {
                    return (long) ((C37781om) ((AnonymousClass276) this).A04.get(i)).A02.A07;
                }
            }
        }
    }

    public final void A02(int i) {
        this.A01.A04(i, 1, null);
    }

    public void A03(AbstractC11910hD r5) {
        AbstractC009505y r2;
        if (this instanceof AbstractC54572f8) {
            AbstractC11900hC r52 = (AbstractC11900hC) r5;
            r52.A0C();
            ((AbstractC54572f8) this).A00.add(r52);
        } else if (this instanceof C54492f0) {
            ((AbstractC11900hC) r5).A0C();
        } else if (this instanceof AnonymousClass276) {
            AnonymousClass276 r3 = (AnonymousClass276) this;
            AnonymousClass05n r1 = ((C37781om) ((C33661h9) r5).A00).A02.A01;
            if (r1 != null && (r1 instanceof C37651oZ) && (r2 = ((C37651oZ) r1).A02) != null) {
                C009205v.A00();
                Handler handler = r3.A05;
                handler.sendMessage(handler.obtainMessage(0, r2));
            }
        }
    }

    public void A04(boolean z) {
        if (!this.A01.A05()) {
            this.A00 = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
