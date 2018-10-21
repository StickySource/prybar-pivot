package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent787
    implements PrybarComponent {

  private RootComponent787 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent787.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent787.class, "root"));
  }

  public RootComponent787 getRoot() {
    return root;
  }

}
