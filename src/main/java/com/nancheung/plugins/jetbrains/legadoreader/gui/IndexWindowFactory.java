package com.nancheung.plugins.jetbrains.legadoreader.gui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.nancheung.plugins.jetbrains.legadoreader.gui.ui.IndexUI;
import org.jetbrains.annotations.NotNull;

public class IndexWindowFactory implements ToolWindowFactory {
    
    private final static IndexUI INDEX_UI = new IndexUI();
    
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        //获取内容工厂的实例
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        //获取用于toolWindow显示的内容
        Content content = contentFactory.createContent(INDEX_UI.getComponent(), "", false);
        //给toolWindow设置内容
        toolWindow.getContentManager().addContent(content);
    }
    
    public static IndexUI instance() {
        return INDEX_UI;
    }
}
