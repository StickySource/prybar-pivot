package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent900
    implements PrybarComponent {

  private RootComponent900 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent900.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent900.class, "root"));
  }

  public RootComponent900 getRoot() {
    return root;
  }

}
