package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0tZ  reason: invalid class name and case insensitive filesystem */
public class C18570tZ {
    public EnumC18490tR A00;
    public String A01;
    public List A02 = null;
    public List A03 = null;

    public C18570tZ(EnumC18490tR r2, String str) {
        this.A00 = r2 == null ? EnumC18490tR.DESCENDANT : r2;
        this.A01 = str;
    }

    public void A00(String str, EnumC18470tP r4, String str2) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        list.add(new C18460tO(str, r4, str2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        EnumC18490tR r1 = this.A00;
        if (r1 == EnumC18490tR.CHILD) {
            sb.append("> ");
        } else if (r1 == EnumC18490tR.FOLLOWS) {
            sb.append("+ ");
        }
        String str = this.A01;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        List<C18460tO> list = this.A02;
        if (list != null) {
            for (C18460tO r2 : list) {
                sb.append('[');
                sb.append(r2.A01);
                int ordinal = r2.A00.ordinal();
                if (ordinal == 1) {
                    sb.append('=');
                    sb.append(r2.A02);
                } else if (ordinal == 2) {
                    sb.append("~=");
                    sb.append(r2.A02);
                } else if (ordinal == 3) {
                    sb.append("|=");
                    sb.append(r2.A02);
                }
                sb.append(']');
            }
        }
        List list2 = this.A03;
        if (list2 != null) {
            for (Object obj : list2) {
                sb.append(':');
                sb.append(obj);
            }
        }
        return sb.toString();
    }
}
