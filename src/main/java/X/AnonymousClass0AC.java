package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.MessageDetailsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0AC  reason: invalid class name */
public class AnonymousClass0AC extends AbstractC003401r {
    public static final AnonymousClass0AC A00 = new AnonymousClass0AC();

    public void A02(AnonymousClass02N r5) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass019 r12 = (AnonymousClass019) r1.next();
                if (r12 instanceof C09170cP) {
                    C09170cP r13 = (C09170cP) r12;
                    if (AnonymousClass1VY.A0b(r5)) {
                        r13.A00.A0q();
                    }
                } else if (r12 instanceof C39651rs) {
                    C39651rs r14 = (C39651rs) r12;
                    if (r5 != null) {
                        Conversation conversation = r14.A00;
                        if (r5.equals(conversation.A14)) {
                            conversation.A0q.A01++;
                            conversation.A0l();
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A03(AnonymousClass02N r9) {
        AnonymousClass0MP r0;
        AnonymousClass02N r02;
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass019 r6 = (AnonymousClass019) r1.next();
                if (r6 instanceof C08750be) {
                    C08740bd r2 = ((C08750be) r6).A00;
                    boolean z = false;
                    if (r2.A0G.A02 == 0) {
                        z = true;
                    }
                    r2.A00(z);
                } else if (r6 instanceof C02830Dq) {
                    C02830Dq r62 = (C02830Dq) r6;
                    AnonymousClass01S r5 = r62.A01;
                    synchronized (r5.A0S) {
                        C02910Dy r03 = (C02910Dy) r5.A0D().get(r9);
                        if (r03 != null && r62.A00.A0c(r03.A02)) {
                            r5.A0P(r9);
                        }
                    }
                    synchronized (r5.A0R) {
                        Map A0C = r5.A0C();
                        if (A0C.containsKey(r9)) {
                            Object obj = A0C.get(r9);
                            if (obj != null) {
                                Iterator it2 = new ArrayList(((Map) obj).values()).iterator();
                                while (it2.hasNext()) {
                                    C02920Dz r22 = (C02920Dz) it2.next();
                                    if (r62.A00.A0c(r22.A02)) {
                                        r5.A0Q(r9, r22.A01);
                                    }
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                } else if (r6 instanceof C51892aD) {
                    C28301Tu r04 = C28301Tu.A0i;
                    if (!(r04 == null || (r0 = r04.A0G) == null || (r02 = r0.A0n.A00) == null || !r02.equals(r9))) {
                        C28301Tu.A0i.A0C();
                    }
                } else if (r6 instanceof C09170cP) {
                    C09170cP r63 = (C09170cP) r6;
                    if (C12060hU.A00.equals(r9)) {
                        r63.A00.A0q();
                    }
                } else if (r6 instanceof AnonymousClass1t3) {
                    MessageDetailsActivity messageDetailsActivity = ((AnonymousClass1t3) r6).A00;
                    if (r9.equals(messageDetailsActivity.A06.A0n.A00)) {
                        if (messageDetailsActivity.A0K.A0J.A05(messageDetailsActivity.A06.A0n) == null) {
                            messageDetailsActivity.finish();
                        }
                    }
                } else if (r6 instanceof C04220Jn) {
                    ((C04220Jn) r6).A0A.A00.remove(r9);
                } else if (r6 instanceof C39651rs) {
                    Conversation conversation = ((C39651rs) r6).A00;
                    if (r9.equals(conversation.A14)) {
                        conversation.A0q();
                        conversation.A0l();
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A04(AbstractC007503q r15, int i) {
        byte b;
        byte b2;
        Object valueOf;
        int i2;
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass019 r5 = (AnonymousClass019) r1.next();
                if (r5 instanceof C04220Jn) {
                    C04220Jn r52 = (C04220Jn) r5;
                    if (!(r15.A0P == null || r52.A01 || (b = r15.A0m) == 8 || b == 10 || System.currentTimeMillis() - r15.A0E <= 900000)) {
                        r52.A01 = true;
                        C03160Fa r8 = r52.A0R;
                        if (r8.A0H()) {
                            AnonymousClass00D r12 = r52.A0D;
                            SharedPreferences sharedPreferences = r12.A00;
                            r12.A0R(sharedPreferences.getInt("logins_with_messages", 0) + 1);
                            StringBuilder sb = new StringBuilder("app/msg/offline/logincount ");
                            sb.append(sharedPreferences.getInt("logins_with_messages", 0));
                            Log.d(sb.toString());
                            if (!r8.A0H()) {
                                Log.d("xmpp/mustbelong");
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("long_connect", true);
                                r8.A11.sendMessage(Message.obtain(null, 0, 3, 0, bundle));
                                r8.A0E(true, false, false, false, 0);
                            }
                        }
                    }
                } else if (r5 instanceof C39651rs) {
                    C39651rs r53 = (C39651rs) r5;
                    if (r15 != null) {
                        C007303n r4 = r15.A0n;
                        AnonymousClass02N r13 = r4.A00;
                        Conversation conversation = r53.A00;
                        if (r13.equals(conversation.A14) && r4.A02 && (b2 = r15.A0m) != 8) {
                            StringBuilder A0S = AnonymousClass008.A0S("conversation/observer/beforemsgadded/add ");
                            A0S.append(r4.A01);
                            A0S.append(" ");
                            AnonymousClass008.A1K(A0S, b2);
                            if (conversation.A1a && (r15 instanceof C05390Oi) && ((i2 = ((C05390Oi) r15).A00) == 1 || i2 == 27 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 12 || i2 == 20 || i2 == 13 || i2 == 14 || i2 == 17 || i2 == 31 || i2 == 32 || i2 == 56)) {
                                conversation.A0s.A00();
                                conversation.A0n();
                            }
                            if (conversation.A07 != 0 && AnonymousClass0FI.A0L(conversation.A28, r15)) {
                                conversation.A0q();
                            }
                            StringBuilder A0S2 = AnonymousClass008.A0S("conversation/beforemsgadded/unseen/");
                            A0S2.append(conversation.A07);
                            A0S2.append("/");
                            A0S2.append(conversation.A05);
                            A0S2.append("/");
                            AnonymousClass008.A1L(A0S2, conversation.A06);
                            if (conversation.A0q.getCursor() != null) {
                                conversation.A0q.A0N.add(r15);
                            }
                            StringBuilder A0S3 = AnonymousClass008.A0S("conversation/observer/beforemsgadded: cursor=");
                            if (conversation.A0q.getCursor() == null) {
                                valueOf = "null";
                            } else {
                                valueOf = Integer.valueOf(conversation.A0q.getCursor().getCount());
                            }
                            A0S3.append(valueOf);
                            A0S3.append(" appended=");
                            A0S3.append(conversation.A0q.A0N.size());
                            Log.d(A0S3.toString());
                            if (!(r15.A08 == 6 || i == 7)) {
                                conversation.A0O.setVisibility(8);
                                if (conversation.A17 != null) {
                                    conversation.A0y(R.drawable.ib_new_round);
                                    conversation.A17 = null;
                                }
                                Conversation.A4m.remove(conversation.A14);
                                C27131Oe r0 = conversation.A0l;
                                if (r0 != null) {
                                    r0.A0Z = null;
                                }
                            }
                            conversation.A0m();
                            conversation.A0s();
                            conversation.A2A.A0A(r15, 1, conversation.A2r.A04() - r15.A0x);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A05(AbstractC007503q r4, int i) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AnonymousClass019) r1.next()).A03(r4, i);
            } else {
                return;
            }
        }
    }

    public void A06(AbstractC007503q r4, int i) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AnonymousClass019) r1.next()).A00(r4, i);
            } else {
                return;
            }
        }
    }

    public void A07(Collection collection, int i) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass019 r3 = (AnonymousClass019) r1.next();
                if (!(r3 instanceof C08600bP)) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        r3.A00((AbstractC007503q) it2.next(), i);
                    }
                } else {
                    C08600bP r32 = (C08600bP) r3;
                    for (Object obj : collection) {
                        if (obj instanceof AnonymousClass0MP) {
                            r32.A00.A07.A07(obj);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A08(Collection collection, Map map, Map map2) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AnonymousClass019) r1.next()).A02(collection, map, map2);
            } else {
                return;
            }
        }
    }
}
