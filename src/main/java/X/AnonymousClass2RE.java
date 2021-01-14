package X;

import android.database.AbstractCursor;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2RE  reason: invalid class name */
public class AnonymousClass2RE extends AbstractCursor {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C014308b A03;
    public final C28691Vj A04;
    public final C28831Vx A05;
    public final List A06;
    public final String[] A07;

    public boolean isNull(int i) {
        return false;
    }

    public AnonymousClass2RE(String[] strArr, List list, C014308b r9, C28831Vx r10, C28691Vj r11) {
        this.A07 = strArr == null ? new String[]{"_id", "display_name", "is_group"} : strArr;
        this.A06 = new ArrayList(list);
        this.A03 = r9;
        this.A05 = r10;
        this.A04 = r11;
        String[] strArr2 = this.A07;
        int i = 0;
        while (true) {
            if (i < strArr2.length) {
                if (strArr2[i].equals("_id")) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        this.A01 = i;
        String[] strArr3 = this.A07;
        int i2 = 0;
        while (true) {
            if (i2 < strArr3.length) {
                if (strArr3[i2].equals("display_name")) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        this.A00 = i2;
        String[] strArr4 = this.A07;
        int i3 = 0;
        while (true) {
            if (i3 < strArr4.length) {
                if (strArr4[i3].equals("is_group")) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        this.A02 = i3;
    }

    public final C007003k A00(int i) {
        if (i >= 0) {
            List list = this.A06;
            if (i < list.size()) {
                return (C007003k) list.get(i);
            }
        }
        StringBuilder A0T = AnonymousClass008.A0T("Position: ", i, ", size = ");
        A0T.append(this.A06.size());
        throw new IllegalStateException(A0T.toString());
    }

    public String[] getColumnNames() {
        return this.A07;
    }

    public int getCount() {
        return this.A06.size();
    }

    public double getDouble(int i) {
        throw new UnsupportedOperationException();
    }

    public float getFloat(int i) {
        throw new UnsupportedOperationException();
    }

    public int getInt(int i) {
        if (i != -1) {
            C007003k A002 = A00(getPosition());
            if (i == this.A02) {
                return A002.A09() ? 1 : 0;
            }
            throw new IllegalStateException(AnonymousClass008.A0G("Column #", i, " is not an int."));
        }
        throw new IllegalStateException("Invalid column index");
    }

    public long getLong(int i) {
        throw new UnsupportedOperationException();
    }

    public short getShort(int i) {
        throw new UnsupportedOperationException();
    }

    public String getString(int i) {
        if (i != -1) {
            C007003k A002 = A00(getPosition());
            if (i == this.A01) {
                C28691Vj r3 = this.A04;
                C28831Vx r2 = this.A05;
                if (r3 != null) {
                    Jid A022 = A002.A02(AnonymousClass02N.class);
                    if (A022 != null) {
                        return r3.A01.A04(r2, A022.getRawString());
                    }
                    return null;
                }
                throw null;
            } else if (i == this.A00) {
                return this.A03.A09(A002, false);
            } else {
                if (i == this.A02) {
                    return Integer.toString(getInt(i));
                }
                throw new IllegalStateException(AnonymousClass008.A0G("Column #", i, " is not a string."));
            }
        } else {
            throw new IllegalStateException("Invalid column index");
        }
    }
}
