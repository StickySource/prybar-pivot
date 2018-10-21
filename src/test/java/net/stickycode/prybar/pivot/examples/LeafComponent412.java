package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent412
    implements PrybarComponent {

  private RootComponent412 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent412.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent412.class, "root"));
  }

  public RootComponent412 getRoot() {
    return root;
  }

}
