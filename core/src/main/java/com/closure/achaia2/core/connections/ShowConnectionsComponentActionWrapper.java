package com.closure.achaia2.core.connections;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.closure.achaia2.core.connections.ShowConnectionsComponentAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

/**
 * Created by mwielocha on 29.01.2014.
 */

@ActionID(category = "Window",
        id = "com.closure.achaia2.core.connections.ShowConnectionsComponentActionWrapper")
@ActionRegistration(displayName = "#CTL_HelloWorldActionListener")
@ActionReference(path = "Menu/File", position = 0)
@Messages("CTL_HelloWorldActionListener=Hello World")
public final class ShowConnectionsComponentActionWrapper implements ActionListener {

    ShowConnectionsComponentAction delegate = new ShowConnectionsComponentAction();

    public void actionPerformed(ActionEvent e) {
        delegate.actionPerformed(e);
    }
}
