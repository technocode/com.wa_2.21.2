package X;

import java.util.List;

/* renamed from: X.3As  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC67843As {
    public String A00;

    public boolean A00() {
        if (this instanceof AnonymousClass3WW) {
            return ((AnonymousClass3WW) this).A05;
        }
        if (this instanceof AnonymousClass3WN) {
            return ((AnonymousClass3WN) this).A02;
        }
        if (!(this instanceof C57862kz)) {
            return false;
        }
        return ((C57862kz) this).A06;
    }

    public String toString() {
        String obj;
        if (this instanceof AnonymousClass3WX) {
            return "web-status-seen";
        }
        if (this instanceof AnonymousClass3WW) {
            AnonymousClass3WW r2 = (AnonymousClass3WW) this;
            StringBuilder A0S = AnonymousClass008.A0S("qr_response type: ");
            A0S.append(r2.A00);
            A0S.append(" id: ");
            A0S.append(r2.A03);
            A0S.append(" #details: ");
            List list = r2.A04;
            A0S.append(list != null ? Integer.valueOf(list.size()) : "-");
            return A0S.toString();
        } else if (this instanceof AnonymousClass3WT) {
            StringBuilder A0S2 = AnonymousClass008.A0S("qr_msg_recv ");
            A0S2.append(((AnonymousClass3WT) this).A02);
            return A0S2.toString();
        } else if (this instanceof AnonymousClass3WS) {
            StringBuilder A0S3 = AnonymousClass008.A0S("web_identity_changed/");
            A0S3.append(((AnonymousClass3WS) this).A00);
            return A0S3.toString();
        } else if (this instanceof AnonymousClass3WR) {
            return "web-frequent-contacts";
        } else {
            if (this instanceof AnonymousClass3WQ) {
                AnonymousClass3WQ r22 = (AnonymousClass3WQ) this;
                StringBuilder sb = new StringBuilder();
                for (AbstractC007503q r0 : r22.A03) {
                    sb.append(" ");
                    sb.append(r0.A0n);
                }
                StringBuilder A0S4 = AnonymousClass008.A0S("qr_del_msgs ");
                A0S4.append(r22.A01);
                A0S4.append((Object) sb);
                A0S4.append(" ");
                A0S4.append(r22.A00);
                return A0S4.toString();
            } else if (this instanceof AnonymousClass3WP) {
                return ((AnonymousClass3WP) this).A01.toString();
            } else {
                if (this instanceof AnonymousClass3WO) {
                    AnonymousClass3WO r23 = (AnonymousClass3WO) this;
                    StringBuilder A0S5 = AnonymousClass008.A0S("qr_chat_seen/");
                    A0S5.append(r23.A00);
                    A0S5.append("/");
                    A0S5.append(r23.A02);
                    return A0S5.toString();
                } else if (this instanceof AnonymousClass3WN) {
                    StringBuilder A0S6 = AnonymousClass008.A0S("qr_bclist_recipients ");
                    A0S6.append(((AnonymousClass3WN) this).A00);
                    return A0S6.toString();
                } else if (this instanceof C57872l0) {
                    C57872l0 r24 = (C57872l0) this;
                    StringBuilder A0S7 = AnonymousClass008.A0S("qr_star_msgs ");
                    A0S7.append(r24.A01);
                    A0S7.append(' ');
                    A0S7.append(r24.A04);
                    A0S7.append(' ');
                    A0S7.append(r24.A00);
                    for (AbstractC007503q r1 : r24.A03) {
                        A0S7.append(" ");
                        A0S7.append(r1.A0n);
                    }
                    return A0S7.toString();
                } else if (!(this instanceof C57862kz)) {
                    C57852ky r25 = (C57852ky) this;
                    StringBuilder A0S8 = AnonymousClass008.A0S("qr_contacts count: ");
                    A0S8.append(r25.A02.size());
                    A0S8.append(" checksum: ");
                    A0S8.append(r25.A01);
                    return A0S8.toString();
                } else {
                    C57862kz r26 = (C57862kz) this;
                    String str = r26.A04;
                    if (str == null) {
                        obj = "most recent msgs";
                    } else {
                        StringBuilder A0S9 = AnonymousClass008.A0S("msg query id: ");
                        A0S9.append(str);
                        obj = A0S9.toString();
                    }
                    StringBuilder A0Z = AnonymousClass008.A0Z("qr_msgs/", obj, "/fwdType:");
                    A0Z.append(r26.A00);
                    A0Z.append("/qryType:");
                    A0Z.append(r26.A01);
                    A0Z.append("/firstUnread:");
                    A0Z.append(r26.A03);
                    A0Z.append("/#msgs:");
                    A0Z.append(r26.A05.size());
                    return A0Z.toString();
                }
            }
        }
    }
}
