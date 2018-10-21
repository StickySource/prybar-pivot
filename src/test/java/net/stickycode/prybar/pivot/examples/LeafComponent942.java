package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent942
    implements PrybarComponent {

  private RootComponent942 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent942.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent942.class, "root"));
  }

  public RootComponent942 getRoot() {
    return root;
  }

}
