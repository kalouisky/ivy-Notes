 
package ivy.notes.widget;

import ivy.notes.data.Notes;
import ivy.notes.tool.ResourceParser;
import android.appwidget.AppWidgetManager;
import android.content.Context;

import ivy.notes.R;


public class NoteWidgetProvider_4x extends NoteWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.update(context, appWidgetManager, appWidgetIds);
    }

    protected int getLayoutId() {
        return R.layout.widget_4x;
    }

    @Override
    protected int getBgResourceId(int bgId) {
        return ResourceParser.WidgetBgResources.getWidget4xBgResource(bgId);
    }

    @Override
    protected int getWidgetType() {
        return Notes.TYPE_WIDGET_4X;
    }
}
