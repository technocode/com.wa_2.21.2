package X;

import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.whatsapp.AudioPickerActivity;
import java.util.ArrayList;

/* renamed from: X.1HR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HR implements DialogInterface.OnClickListener {
    public final /* synthetic */ AudioPickerActivity A00;

    public /* synthetic */ AnonymousClass1HR(AudioPickerActivity audioPickerActivity) {
        this.A00 = audioPickerActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AudioPickerActivity audioPickerActivity = this.A00;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AnonymousClass1KR r0 : audioPickerActivity.A0D.values()) {
            arrayList.add(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, (long) r0.A00));
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("result_uris", arrayList);
        audioPickerActivity.setResult(-1, intent);
        audioPickerActivity.finish();
    }
}
