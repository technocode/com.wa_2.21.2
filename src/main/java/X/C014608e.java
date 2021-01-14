package X;

import android.content.Context;
import android.text.format.Formatter;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.08e  reason: invalid class name and case insensitive filesystem */
public class C014608e {
    public static final C014608e A01 = new C014608e();
    public CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void A00(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass0R5 r7 = (AnonymousClass0R5) it.next();
            if (i == 0) {
                Context context = r7.A00;
                String formatFileSize = Formatter.formatFileSize(context, r7.A01.A03());
                AnonymousClass01X r3 = r7.A03;
                C002001d.A2T(context, r3, r7.A02, r3.A0D(R.string.error_report_db_or_disk_is_full, formatFileSize));
            } else if (i == 1) {
                long A03 = r7.A01.A03();
                if (A03 < 10485760) {
                    Context context2 = r7.A00;
                    String formatFileSize2 = Formatter.formatFileSize(context2, A03);
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorreporter/diskio/diskspace ");
                    sb.append(formatFileSize2);
                    Log.i(sb.toString());
                    if (formatFileSize2 != null) {
                        AnonymousClass01X r4 = r7.A03;
                        AnonymousClass03C r32 = r7.A02;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(r4.A06(R.string.error_msgstore_db_diskio));
                        sb2.append(" ");
                        sb2.append(r4.A0D(R.string.error_possible_cause_is_low_disk_space, formatFileSize2));
                        C002001d.A2T(context2, r4, r32, sb2.toString());
                    }
                }
                Context context3 = r7.A00;
                AnonymousClass01X r2 = r7.A03;
                C002001d.A2T(context3, r2, r7.A02, r2.A06(R.string.error_msgstore_db_diskio));
            } else if (i == 2) {
                Context context4 = r7.A00;
                AnonymousClass01X r22 = r7.A03;
                C002001d.A2T(context4, r22, r7.A02, r22.A06(R.string.msg_store_lost_due_to_previous_error));
            } else if (i == 3) {
                Context context5 = r7.A00;
                AnonymousClass01X r23 = r7.A03;
                C002001d.A2T(context5, r23, r7.A02, r23.A06(R.string.error_unable_to_open_msgstoredb));
            } else if (i == 4) {
                Context context6 = r7.A00;
                AnonymousClass01X r24 = r7.A03;
                C002001d.A2T(context6, r24, r7.A02, r24.A06(R.string.error_unable_to_update_readonly_msgstoredb));
            } else {
                continue;
            }
        }
    }
}
