package com.closure.achaia2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

/**
 * Created by mwielocha on 29.01.2014.
 */

@ActionID(category = "Window",
        id = "com.closure.achaia2.SampleActionListenerWrapper")
@ActionRegistration(displayName = "#CTL_HelloWorldActionListener")
@ActionReference(path = "Menu/File", position = 0)
@Messages("CTL_HelloWorldActionListener=Hello World")
public final class SampleActionListenerWrapper implements ActionListener {

    SampleActionListener delegate = new SampleActionListener();

    public void actionPerformed(ActionEvent e) {
        delegate.actionPerformed(e);
    }
}
