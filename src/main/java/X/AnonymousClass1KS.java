package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.AudioPickerActivity;

/* renamed from: X.1KS  reason: invalid class name */
public class AnonymousClass1KS extends CursorAdapter {
    public ActivityC004702f A00;
    public final /* synthetic */ AudioPickerActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1KS(AudioPickerActivity audioPickerActivity, ActivityC004702f r4) {
        super(r4, (Cursor) null, 0);
        this.A01 = audioPickerActivity;
        this.A00 = r4;
    }

    public final AnonymousClass1KR A00(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        AudioPickerActivity audioPickerActivity = this.A01;
        int i = cursor.getInt(0);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(3);
        cursor.getString(4);
        return new AnonymousClass1KR(audioPickerActivity, i, string, string2, string3, cursor.getInt(5), cursor.getInt(6));
    }

    public void bindView(View view, Context context, Cursor cursor) {
        new AnonymousClass1KT(this.A01, view, cursor.getPosition()).A04(A00(cursor), this.A00);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A01.getLayoutInflater().inflate(R.layout.audio_file_row, viewGroup, false);
    }
}
