package X;

import android.widget.BaseAdapter;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2FE  reason: invalid class name */
public class AnonymousClass2FE extends BaseAdapter {
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();
    public final /* synthetic */ PairedDevicesActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass2FE(PairedDevicesActivity pairedDevicesActivity) {
        this.A02 = pairedDevicesActivity;
    }

    public int getCount() {
        return this.A00.size() + this.A01.size();
    }

    public Object getItem(int i) {
        List list;
        if (i < this.A01.size()) {
            list = this.A01;
        } else {
            list = this.A00;
            i -= this.A01.size();
        }
        return list.get(i);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        if (r1.equals("chrome") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fc, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0108, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0122, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FE.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
