package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import com.google.android.search.verification.client.R;

/* renamed from: X.29y  reason: invalid class name and case insensitive filesystem */
public class DialogInterface$OnClickListenerC464029y extends AnonymousClass0MD implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener {
    public DatePickerDialog.OnDateSetListener A00;
    public final DatePicker A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public DialogInterface$OnClickListenerC464029y(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, R.style.DatePickerDialog);
        DatePicker datePicker = new DatePicker(getContext());
        this.A01 = datePicker;
        C12810j6 r1 = ((AnonymousClass0MD) this).A00;
        r1.A0F = datePicker;
        r1.A08 = 0;
        A03(-1, this.A02.A06(R.string.ok), this);
        A03(-2, this.A02.A06(R.string.cancel), this);
        this.A01.init(i, i2, i3, this);
        this.A00 = onDateSetListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            cancel();
        } else if (i == -1 && this.A00 != null) {
            DatePicker datePicker = this.A01;
            datePicker.clearFocus();
            this.A00.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
        }
    }

    public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        this.A01.init(i, i2, i3, this);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A01.init(bundle.getInt("year"), bundle.getInt("month"), bundle.getInt("day"), this);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        DatePicker datePicker = this.A01;
        onSaveInstanceState.putInt("year", datePicker.getYear());
        onSaveInstanceState.putInt("month", datePicker.getMonth());
        onSaveInstanceState.putInt("day", datePicker.getDayOfMonth());
        return onSaveInstanceState;
    }
}
