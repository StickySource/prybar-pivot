package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent682
    implements PrybarComponent {

  private RootComponent682 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent682.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent682.class, "root"));
  }

  public RootComponent682 getRoot() {
    return root;
  }

}
