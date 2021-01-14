package X;

import android.database.AbstractCursor;
import com.whatsapp.jid.Jid;
import java.util.AbstractList;
import java.util.List;

/* renamed from: X.2Gv  reason: invalid class name and case insensitive filesystem */
public class C47192Gv extends AbstractCursor {
    public static final String[] A03 = {"jid", "name"};
    public final AnonymousClass01A A00;
    public final C014308b A01;
    public final AnonymousClass01Q A02;

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        return 0;
    }

    public long getLong(int i) {
        return 0;
    }

    public short getShort(int i) {
        return 0;
    }

    public boolean isNull(int i) {
        return false;
    }

    public C47192Gv(AnonymousClass01A r1, C014308b r2, AnonymousClass01Q r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String[] getColumnNames() {
        return A03;
    }

    public int getCount() {
        return this.A02.A02();
    }

    public String getString(int i) {
        if (i == 0) {
            List A0A = this.A02.A0A();
            int position = getPosition();
            AbstractList abstractList = (AbstractList) A0A;
            if (abstractList.size() > position) {
                return ((Jid) abstractList.get(position)).getRawString();
            }
        } else if (i != 1) {
            return "";
        }
        List A0A2 = this.A02.A0A();
        int position2 = getPosition();
        AbstractList abstractList2 = (AbstractList) A0A2;
        if (abstractList2.size() > position2) {
            return this.A01.A08(this.A00.A0A((AnonymousClass02N) abstractList2.get(position2)), false);
        }
        return "";
    }
}
