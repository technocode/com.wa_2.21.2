package X;

import android.widget.Filter;
import com.whatsapp.DocumentPickerActivity;
import java.util.ArrayList;

/* renamed from: X.1LZ  reason: invalid class name */
public class AnonymousClass1LZ extends Filter {
    public int A00 = 0;
    public final /* synthetic */ DocumentPickerActivity A01;

    public AnonymousClass1LZ(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x006c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r9) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LZ.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            this.A01.A08 = (ArrayList) filterResults.values;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A03.notifyDataSetChanged();
        DocumentPickerActivity.A04(documentPickerActivity);
    }
}
