package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent225
    implements PrybarComponent {

  private RootComponent225 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent225.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent225.class, "root"));
  }

  public RootComponent225 getRoot() {
    return root;
  }

}
