package com.closure.achaia2.core.connections

import org.openide.windows.TopComponent
import java.awt.BorderLayout
import org.openide.explorer.{ExplorerUtils, ExplorerManager}
import org.openide.nodes.AbstractNode
import org.openide.nodes.FilterNode.Children

/**
 * Created by mwielocha on 30.01.2014.
 */
class ConnectionsComponent extends TopComponent with ExplorerManager.Provider {

    @transient
    private val explorerManager = new ExplorerManager

    def getExplorerManager: ExplorerManager = explorerManager


    associateLookup(ExplorerUtils.createLookup(explorerManager, getActionMap()));
//    explorerManager.setRootContext(new AbstractNode(new Children()))
    explorerManager.getRootContext().setDisplayName("Marilyn Monroe's Movies")

    setName("A component")


}
