package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent340
    implements PrybarComponent {

  private RootComponent340 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent340.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent340.class, "root"));
  }

  public RootComponent340 getRoot() {
    return root;
  }

}
