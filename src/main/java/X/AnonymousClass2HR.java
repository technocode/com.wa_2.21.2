package X;

import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.2HR  reason: invalid class name */
public class AnonymousClass2HR implements ActionMode.Callback {
    public final /* synthetic */ C60672pw A00;

    public void onDestroyActionMode(ActionMode actionMode) {
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public AnonymousClass2HR(C60672pw r1) {
        this.A00 = r1;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        String str;
        C60672pw r2 = this.A00;
        int selectionStart = r2.getSelectionStart();
        int selectionEnd = r2.getSelectionEnd();
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.bold) {
            str = "*";
        } else if (itemId == R.id.italic) {
            str = "_";
        } else if (itemId == R.id.strikethrough) {
            str = "~";
        } else if (itemId != R.id.monospace) {
            return false;
        } else {
            str = "```";
        }
        Editable text = r2.getText();
        while (selectionEnd > selectionStart) {
            int i = selectionEnd - 1;
            if (!Character.isSpaceChar(text.charAt(i))) {
                break;
            }
            selectionEnd = i;
        }
        if (selectionEnd < text.length()) {
            char charAt = text.charAt(selectionEnd);
            if (!(Character.isSpaceChar(charAt) || charAt == '*' || charAt == '_' || charAt == '~')) {
                text.insert(selectionEnd, " ");
            }
        }
        text.insert(selectionEnd, str);
        while (selectionStart < selectionEnd && Character.isSpaceChar(text.charAt(selectionStart))) {
            selectionStart++;
        }
        if (selectionStart > 0) {
            char charAt2 = text.charAt(selectionStart - 1);
            if (!(Character.isSpaceChar(charAt2) || charAt2 == '*' || charAt2 == '_' || charAt2 == '~')) {
                text.insert(selectionStart, " ");
                selectionStart++;
            }
        }
        text.insert(selectionStart, str);
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        MenuInflater menuInflater = actionMode.getMenuInflater();
        if (menuInflater != null) {
            menuInflater.inflate(R.menu.text_style, menu);
            return true;
        }
        Log.w("conversation-text-entry/action-mode-with-null-menu-inflater");
        return true;
    }
}
