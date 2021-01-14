package X;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0hD  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11910hD {
    public static final List A0I = Collections.emptyList();
    public int A00;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = 0;
    public long A08 = -1;
    public C16480ps A09 = null;
    public AbstractC11910hD A0A = null;
    public AbstractC11910hD A0B = null;
    public RecyclerView A0C;
    public WeakReference A0D;
    public List A0E = null;
    public List A0F = null;
    public boolean A0G = false;
    public final View A0H;

    public AbstractC11910hD(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final int A00() {
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A09(this);
    }

    public final int A01() {
        int i = this.A06;
        return i == -1 ? this.A05 : i;
    }

    public List A02() {
        if ((this.A00 & 1024) != 0) {
            return A0I;
        }
        List list = this.A0E;
        if (list == null || list.size() == 0) {
            return A0I;
        }
        return this.A0F;
    }

    public void A03() {
        this.A00 = 0;
        this.A05 = -1;
        this.A03 = -1;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = 0;
        this.A0A = null;
        this.A0B = null;
        List list = this.A0E;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A07 = 0;
        this.A04 = -1;
        RecyclerView.A04(this);
    }

    public void A04(int i) {
        this.A00 = i | this.A00;
    }

    public void A05(int i, int i2) {
        this.A00 = (i & i2) | (this.A00 & (i2 ^ -1));
    }

    public void A06(int i, boolean z) {
        if (this.A03 == -1) {
            this.A03 = this.A05;
        }
        int i2 = this.A06;
        if (i2 == -1) {
            i2 = this.A05;
            this.A06 = i2;
        }
        if (z) {
            this.A06 = i2 + i;
        }
        this.A05 += i;
        View view = this.A0H;
        if (view.getLayoutParams() != null) {
            ((C16410pl) view.getLayoutParams()).A01 = true;
        }
    }

    public final void A07(boolean z) {
        int i;
        int i2 = this.A01;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.A01 = i;
        if (i < 0) {
            this.A01 = 0;
            StringBuilder sb = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", sb.toString());
        } else if (!z) {
            if (i == 1) {
                this.A00 |= 16;
            }
        } else if (i == 0) {
            this.A00 &= -17;
        }
    }

    public boolean A08() {
        return (this.A00 & 4) != 0;
    }

    public boolean A09() {
        return (this.A00 & 8) != 0;
    }

    public boolean A0A() {
        return (this.A00 & 256) != 0;
    }

    public boolean A0B() {
        return (this.A00 & 128) != 0;
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("ViewHolder{");
        A0S.append(Integer.toHexString(hashCode()));
        A0S.append(" position=");
        A0S.append(this.A05);
        A0S.append(" id=");
        A0S.append(this.A08);
        A0S.append(", oldPos=");
        A0S.append(this.A03);
        A0S.append(", pLpos:");
        A0S.append(this.A06);
        StringBuilder sb = new StringBuilder(A0S.toString());
        if (this.A09 != null) {
            sb.append(" scrap ");
            if (this.A0G) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (A08()) {
            sb.append(" invalid");
        }
        int i = this.A00;
        if ((1 & i) == 0) {
            sb.append(" unbound");
        }
        if ((i & 2) != 0) {
            sb.append(" update");
        }
        if (A09()) {
            sb.append(" removed");
        }
        if (A0B()) {
            sb.append(" ignored");
        }
        if (A0A()) {
            sb.append(" tmpDetached");
        }
        if ((i & 16) != 0 || this.A0H.hasTransientState()) {
            StringBuilder A0S2 = AnonymousClass008.A0S(" not recyclable(");
            A0S2.append(this.A01);
            A0S2.append(")");
            sb.append(A0S2.toString());
        }
        if ((this.A00 & 512) != 0 || A08()) {
            sb.append(" undefined adapter position");
        }
        if (this.A0H.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
