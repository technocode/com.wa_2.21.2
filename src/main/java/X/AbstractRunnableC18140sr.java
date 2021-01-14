package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.0sr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractRunnableC18140sr extends RunnableEmptyBase implements Runnable {
    public final C453624k A00 = new C453624k();

    /* JADX INFO: finally extract failed */
    public void run() {
        try {
            C31531dN r1 = (C31531dN) this;
            AbstractC18040sg A09 = r1.A00.A04.A09();
            String str = r1.A01;
            C31481dI r2 = (C31481dI) A09;
            if (r2 != null) {
                C30721bp A002 = C30721bp.A00("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                if (str == null) {
                    A002.A03[1] = 1;
                } else {
                    A002.A02(1, str);
                }
                AbstractC16780qQ r11 = r2.A01;
                r11.A01();
                r11.A02();
                try {
                    Cursor A003 = C16830qW.A00(r11, A002, true);
                    try {
                        int A08 = AnonymousClass0N2.A08(A003, "id");
                        int A082 = AnonymousClass0N2.A08(A003, "state");
                        int A083 = AnonymousClass0N2.A08(A003, "output");
                        int A084 = AnonymousClass0N2.A08(A003, "run_attempt_count");
                        AnonymousClass05V r6 = new AnonymousClass05V();
                        AnonymousClass05V r5 = new AnonymousClass05V();
                        while (A003.moveToNext()) {
                            if (!A003.isNull(A08)) {
                                String string = A003.getString(A08);
                                if (((ArrayList) r6.get(string)) == null) {
                                    r6.put(string, new ArrayList());
                                }
                            }
                            if (!A003.isNull(A08)) {
                                String string2 = A003.getString(A08);
                                if (((ArrayList) r5.get(string2)) == null) {
                                    r5.put(string2, new ArrayList());
                                }
                            }
                        }
                        A003.moveToPosition(-1);
                        r2.A05(r6);
                        r2.A04(r5);
                        ArrayList arrayList = new ArrayList(A003.getCount());
                        while (A003.moveToNext()) {
                            ArrayList arrayList2 = !A003.isNull(A08) ? (ArrayList) r6.get(A003.getString(A08)) : null;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = !A003.isNull(A08) ? (ArrayList) r5.get(A003.getString(A08)) : null;
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            C18020se r12 = new C18020se();
                            r12.A03 = A003.getString(A08);
                            r12.A02 = AnonymousClass0N2.A0h(A003.getInt(A082));
                            r12.A01 = C17550rj.A00(A003.getBlob(A083));
                            r12.A00 = A003.getInt(A084);
                            r12.A05 = arrayList2;
                            r12.A04 = arrayList3;
                            arrayList.add(r12);
                        }
                        r11.A04();
                        A003.close();
                        A002.A01();
                        r11.A03();
                        this.A00.A08(C18030sf.A0H.A20(arrayList));
                    } catch (Throwable th) {
                        A003.close();
                        A002.A01();
                        throw th;
                    }
                } catch (Throwable th2) {
                    r11.A03();
                    throw th2;
                }
            } else {
                throw null;
            }
        } catch (Throwable th3) {
            this.A00.A09(th3);
        }
    }
}
